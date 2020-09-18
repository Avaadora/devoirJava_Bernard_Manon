import java.util.Arrays;

class App {
  public static void main(final String[] args) {

    String[] words = {
        "coco",
        "pedro",
        "pedro",
        "pedro",
        "pedro",
        "jaco",
        "coco",
        "jaco",
      };
      String[] newList = new String[words.length];
      for (int i = 0; i < words.length; i++) {
        int index = -1;
        String word = words[i];
        for (int j = 0; j < newList.length; j++) {
          if (newList[j] == null || newList[j].equals(word)) {
            index = j;
          }
        }
        if (index >= 0) {
          newList[index] = word;
        }
      }

      for (int k =0 ; k < newList.length; k++){
          if (newList[k] == null){
          }
          else{
            System.out.println(Arrays.toString(newList)); // --> SANS DOUBLONS !
            // System.out.print(newList[k] + ", ");
      }
  }
  
    // final String[] words = { "Livre", "Avion", "Zébre", "Pierre", "Feuille", "Maison", "Riche", "Sel", };

    // final String[] listeTrie = new String[words.length];

    // for (int i = 0; i < words.length; i++) {
    //   int indexAtWord = -1;
    //   final String word = words[i];

    //   for(int j = 0; j < listeTrie.length; j++) {
    //     if(listeTrie[j] == null || listeTrie[j].equals(word)) {
    //       indexAtWord = j;
    //     }
    //   }

    //   if(indexAtWord >= 0) {
    //     listeTrie[indexAtWord] = word;

    //   }
    // }
    // Arrays.sort(listeTrie);

    // System.out.println(Arrays.toString(listeTrie)); 
  }

}