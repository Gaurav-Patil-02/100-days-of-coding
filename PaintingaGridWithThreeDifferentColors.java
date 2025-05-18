import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaintingaGridWithThreeDifferentColors {

     static final int MOD = 1_000_000_007;

    public int colorTheGrid(int m, int n) {
        List<int[]> states = new ArrayList<>();
        generateStates(new int[m], 0, states);

        // Map current state id to list of compatible previous state ids
        Map<Integer, List<Integer>> compatible = new HashMap<>();

        for (int i = 0; i < states.size(); i++) {
            compatible.put(i, new ArrayList<>());
            for (int j = 0; j < states.size(); j++) {
                if (isCompatible(states.get(i), states.get(j))) {
                    compatible.get(i).add(j);
                }
            }
        }

        int[][] dp = new int[n][states.size()];

        // Initialize first column
        for (int i = 0; i < states.size(); i++) {
            dp[0][i] = 1;
        }

        // Build DP table
        for (int col = 1; col < n; col++) {
            for (int i = 0; i < states.size(); i++) {
                for (int prev : compatible.get(i)) {
                    dp[col][i] = (dp[col][i] + dp[col - 1][prev]) % MOD;
                }
            }
        }

        // Sum up all valid colorings for the last column
        int result = 0;
        for (int val : dp[n - 1]) {
            result = (result + val) % MOD;
        }

        return result;
    }

    // Generate all valid vertical column colorings
    private void generateStates(int[] curr, int pos, List<int[]> res) {
        if (pos == curr.length) {
            res.add(Arrays.copyOf(curr, curr.length));
            return;
        }
        for (int color = 0; color < 3; color++) {
            if (pos > 0 && curr[pos - 1] == color) continue;
            curr[pos] = color;
            generateStates(curr, pos + 1, res);
        }
    }

    // Check if two vertical colorings are horizontally compatible
    private boolean isCompatible(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) return false;
        }
        return true;
    }

    // For testing
    public static void main(String[] args) {
        PaintingaGridWithThreeDifferentColors solver = new PaintingaGridWithThreeDifferentColors();
        System.out.println(solver.colorTheGrid(1, 1)); 
        System.out.println(solver.colorTheGrid(1, 2)); 
        System.out.println(solver.colorTheGrid(5, 5)); 
        }
}