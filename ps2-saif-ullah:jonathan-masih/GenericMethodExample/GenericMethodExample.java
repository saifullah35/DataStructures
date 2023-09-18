public class GenericMethodExample
{
    ///**
    // * Returns the number of times itemToCount occurs in list.  
    //* 
    // * @return the number of times itemToCount occurs in the list.
    // */
    //public static int countOccurrences(String[] list, String itemToCount) 
    // {
    //     int count = 0;
    //
    //     if (itemToCount == null) {
    //         for (String listItem : list ){
    //             if (listItem == null){
    //                 count++;
    //             }
    //        }
    //    } else {
    //       for (String listItem : list ){
    //           if (itemToCount.equals(listItem)){
    //              count++;
    //         }
    //     }
    //  }
    //  return count;
    // }

    /**
     * Returns the number of times itemToCount occurs in list.  
     * 
     * @return the number of times itemToCount occurs in the list.
     */
    public static <T> int countOccurrences(T[] list, T itemToCount) 
    {
        int count = 0;

        if (itemToCount == null) {
            for (T listItem : list ){
                if (listItem == null){
                    count++;
                }
            }
        } else {
            for (T listItem : list ){
                if (itemToCount.equals(listItem)){
                    count++;
                }
            }
        }
        return count;
    }
}