class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        Stack<Integer>st=new Stack<>();
        Deque<Integer>dq=new ArrayDeque<>();
        for(int x:students)dq.add(x);
        for(int i=n-1;i>=0;i--)st.add(sandwiches[i]);

        // System.out.println(st.peek());
        int cant_eat = 0;
        while(!dq.isEmpty()){
            if(cant_eat==dq.size())break;
            if(dq.peek() == st.peek()){
                cant_eat = 0;
                dq.pollFirst();
                st.pop();
            }else{
                cant_eat++;
                int curr_student = dq.pollFirst();
                dq.addLast(curr_student);
            }
        }
        return dq.size();


    }
}