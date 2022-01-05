class Solution:
    def decodedString(self, s):
        st = []
        i = 0
        while i < len(s):
            if s[i] != ']':
                st.append(s[i])
            else:
                x = ""
                while st[-1] != '[':
                    x = st.pop() + x
                if st[-1] == '[':
                    st.pop()
                    num = ""
                    while len(st) and st[-1].isdigit():
                        num += st.pop()
                    reps = int(num[::-1])
                    x *= reps
                    st.append(x)
            i+=1
        return ''.join(st)