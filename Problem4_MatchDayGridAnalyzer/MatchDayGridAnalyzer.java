public class MatchDayGridAnalyzer {
    private static double rowAverage(int[] row) {
        int total = 0;
        for (int runs : row) {
            total += runs;
        }
        return (double) total / row.length;
    }

    public static String classifyMatches(int[][] runsPerOver, int threshold) {
        StringBuilder result = new StringBuilder();

        for (int match = 0; match < runsPerOver.length; match++) {
            if (match > 0) {
                result.append(" | ");
            }

            double average = rowAverage(runsPerOver[match]);
            String classification = average >= threshold ? "Power Surge" : "Normal";
            result.append("Match ").append(match).append(": ").append(classification);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[][] runsPerOver = {
            {4, 6, 8},
            {10, 12, 14},
            {2, 3, 1}
        };
        System.out.println(classifyMatches(runsPerOver, 8));
    }
}
