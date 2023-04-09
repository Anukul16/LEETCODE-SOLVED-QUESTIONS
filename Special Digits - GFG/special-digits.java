//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int A;
            A = Integer.parseInt(br.readLine());
            
            
            int B;
            B = Integer.parseInt(br.readLine());
            
            
            int C;
            C = Integer.parseInt(br.readLine());
            
            
            int D;
            D = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.bestNumbers(N, A, B, C, D);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public boolean check(int n, int c, int d) {
        while(n > 0) {
            int r = n % 10;
            if(r == c || r == d) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
    
    public long binpow(long a, long b, long mod) {
        long res = 1;
        while(b > 0) {
            if((b & 1) == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
    
    public int bestNumbers(int N, int A, int B, int C, int D) {
        if(A == B) {
            return check(N * A, C, D) ? 1 : 0;
        } 
        long mod = (long) 1e9 + 7;
        long ans = 0;
        List<Long> fac = new ArrayList<>(Collections.nCopies(N + 1, 0L));
        fac.set(0, 1L);
        for(long i = 1; i <= N; i++) {
            fac.set((int) i, (fac.get((int) (i - 1)) * i) % mod);
        }
        for(int i = 0; i <= N; i++) {
            int s = i * A + (N - i) * B;
            if(check(s, C, D)) {
                ans = (ans + (fac.get(N) * binpow((fac.get(i) * fac.get(N - i)) % mod, mod - 2, mod)) % mod) % mod;
            }
        }
        return (int) ans;
    }
}   
