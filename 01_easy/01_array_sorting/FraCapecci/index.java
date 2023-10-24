public class index{
    public static void main(String[] args){
        int[] array = {5,7,1,33,9,4,98};
        //ordina crescente
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j< array.length; j++){
                if (array[j] < array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    
                }
            }
        }
        //stampa array
        for(int k = 0; k< array.length;k++){
            System.out.println(array[k]);
        }
    }
}