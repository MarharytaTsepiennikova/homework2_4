package Task4_1;

public class FileEvent implements IFileEvent {
    @Override
    public void onFileAdded() {
        System.out.println("All files added");
    }
}
