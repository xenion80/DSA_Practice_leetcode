class Solution:
    def maxNumOfSubstrings(self, s):
        n = len(s)

        first = [n] * 26
        last = [-1] * 26

        # Find first and last occurrence
        for i, ch in enumerate(s):
            c = ord(ch) - ord('a')
            first[c] = min(first[c], i)
            last[c] = i

        intervals = []

        # Build valid intervals
        for c in range(26):
            if last[c] == -1:
                continue

            l, r = first[c], last[c]
            valid = True

            i = l
            while i <= r:
                x = ord(s[i]) - ord('a')

                # x has an occurrence before l
                if first[x] < l:
                    valid = False
                    break

                # Must include all occurrences of x
                r = max(r, last[x])
                i += 1

            if valid:
                intervals.append((r, l))

        # Earliest ending interval first
        intervals.sort()

        ans = []
        prevEnd = -1

        for r, l in intervals:
            if l > prevEnd:
                ans.append(s[l:r + 1])
                prevEnd = r

        return ans