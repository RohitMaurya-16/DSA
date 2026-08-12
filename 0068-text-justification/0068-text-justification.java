class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> list = new ArrayList<>();
        int n = words.length;

        for (int i = 0; i < n; ) {

            int j = i;
            int totalWordLength = 0;

            for (; j < n; j++) {

                int requiredLength =
                    totalWordLength + words[j].length() + (j - i);

                if (requiredLength > maxWidth) {
                    break;
                }

                totalWordLength += words[j].length();
            }

            int numberOfWords = j - i;
            int gaps = numberOfWords - 1;

            StringBuilder line = new StringBuilder();

            if (j == n || numberOfWords == 1) {

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k < j - 1) {
                        line.append(" ");
                    }
                }

                for (int k = line.length(); k < maxWidth; k++) {
                    line.append(" ");
                }

            } else {

                int totalSpaces = maxWidth - totalWordLength;

                int spacesPerGap = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k < j - 1) {

                        int spaces = spacesPerGap;

                        if (k - i < extraSpaces) {
                            spaces++;
                        }

                        for (int x = 0; x < spaces; x++) {
                            line.append(" ");
                        }
                    }
                }
            }

            list.add(line.toString());

            // Move to next group of words
            i = j;
        }

        return list;
    }
}