class Solution {
    
    class Pair{
        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Pair> maxH=new PriorityQueue<>(Collections.reverseOrder(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.key == o2.key)
                {
                    if(o1.value > o2.value)
                        return 1;

                    return -1;
                }
                else
                {
                    if(o1.key > o2.key)
                        return 1;

                    return -1;
                }
            }
        }));

        List<Integer> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            maxH.add(new Pair(Math.abs(arr[i]-x),arr[i]));

            if(maxH.size()>k)
            {
                maxH.poll();
            }
        }
        while (!maxH.isEmpty())
        {
            list.add(maxH.poll().value);
        }

        
        Collections.sort(list);

        return list;
    }
}