package rvt;

public class IndexofSmallestFrom{
    public static int FindindexOfSmallesFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++){
            if(smallest > table[i]){
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }


}
    

