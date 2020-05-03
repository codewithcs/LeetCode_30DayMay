public static boolean canConstruct(String ransomNote, String magazine) {

        int i= 0 ; int j = 0;

         if(ransomNote.length()==0 && magazine.length()==0) return true ;

        if(ransomNote.length()==0) return true ;

        if(magazine.length()==0) return false;

        char [] chars = ransomNote.toCharArray()  ;
        Arrays.sort(chars);
        String sortedRansomNote = new String( chars) ;

        char [] chars2 = ransomNote.toCharArray()  ;
        Arrays.sort(chars2);
        String sortedMagazine = new String(chars2) ;

        while(i<sortedRansomNote.length() && j < sortedMagazine.length()  ) {
        	
            if( sortedRansomNote.charAt(i) == sortedMagazine.charAt(j)) {
                i++ ;
                j++ ;
                System.out.println("i is : " + i );
            }
            else {
            j++ ;
            }

            if(i==sortedRansomNote.length()) {
                return true;
            }

        }

        return false;

    }
