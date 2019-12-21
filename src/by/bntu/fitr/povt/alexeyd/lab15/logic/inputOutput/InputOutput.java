package by.bntu.fitr.povt.alexeyd.lab15.logic.inputOutput;

public class InputOutput {

    public void run () {
        String fileName = "c:\\InputOutput\\text.ghf";
        String fileCharacterName = "c:\\InputOutput\\text.txt";
        String fileCharacterNameUnix = "src/by/bntu/fitr/povt/alexeyd/lectureInputOutputStream/inputOutput/text.txt";

        //BinaryStreamWorker.write(fileName);
        //BinaryStreamWorker.read(fileName);

        CharacterStreamWorker.write(fileCharacterName);
        CharacterStreamWorker.read(fileCharacterNameUnix);
    }
}
