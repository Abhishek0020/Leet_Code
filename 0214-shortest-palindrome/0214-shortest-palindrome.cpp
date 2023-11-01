class Solution {
public:
    string shortestPalindrome(string s) 
    {
        if(s.empty())
        {
            return "";
        }
        int ans = 0;
        int start = 0;
        int end = s.size()-1;
        int i = 0;
        int j = end;
        while(i<j)
        {
            i = start;
            j = end-ans;

            while(s[i] != s[j])
            {
                ans++;
                j--;
            }
            if(s[i]==s[j])
            {
                while(s[i]==s[j] and i<j)
                {
                    i++;
                    j--;
                }
            }
            if(i<j)
            {
                ans++;
            }

        }
        int m = s.size()-ans;
        string su = s.substr(m,ans);
        reverse(su.begin(),su.end());
        return su+s;
    }
};