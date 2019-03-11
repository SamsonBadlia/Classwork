public class partition{

  public static int partition(int [] data, int start, int end){

    int pivot = ((int)(Math.random() * 10) % (end + 1 - start)) + start;

    int first =  data[start];
    data[start] = data[pivot];
    data[pivot] = first;
    pivot = start;

    int s = start + 1;
    int e = end;
    while(s != e){
      if(data[s] > data[pivot]){
        int temp = data[s];
        data[s] = data[e];
        data[e] = temp;
        e --;
      }else if(data[s] <= data[pivot]){
        s++;
      }
    }

    for(int i = start; i < end + 1; i++){
      if(data[i] > data[pivot]){
        int temp = data[i - 1];
        data[i - 1] = data[pivot];
        data[pivot] = temp;
        return i - 1;
      }
    }

    int temp = data[end];
    data[end] = data[pivot];
    data[pivot] = temp;
    return end;
    }

  }
