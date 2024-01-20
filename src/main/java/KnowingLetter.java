public interface KnowingLetter {
    static void knowletter(String letter) {
        if(Ahorcado.getBelieveword().indexOf(letter.charAt(0)) != -1){
            if(Storeletters.store(letter) == 0) {
                char[] user = new char[Ahorcado.getBelieveword().length()];
                if (Ahorcado.getUserword() != "") {
                    user = Ahorcado.getUserword().toCharArray();
                }
                for (int i = 0; i < Ahorcado.getBelieveword().length(); i++) {
                    if (Ahorcado.getBelieveword().charAt(i) == letter.charAt(0)) {
                        user[i] = letter.charAt(0);
                    }
                }
                Ahorcado.setUserword(new String(user));
            }


        }else{
            Ahorcado.lostlife();
        }
    }




}

