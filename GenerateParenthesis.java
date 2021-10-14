class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        p(result,"",0,0,n);
        return result;
    }
    public void p(List<String> output,String current,int start,int end,int max)
    {
        if(current.length() == max*2)
        {
            output.add(current);
            return ;
        }
        
        if(start<max) p(output,current+"(",start+1,end,max);
        if(end<start) p(output,current+")",start,end+1,max);
    }
}
