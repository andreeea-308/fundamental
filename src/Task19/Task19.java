package Task19;

public class Task19 {
    public static void main(String[] args) {

        Author shakespeare = new Author("Shakespeare", "English");
        Author pushkin = new Author("Pushkin", "Russian");
        Author neruda = new Author("Neruda", "Chilean");

        Poem poem1 = new Poem(shakespeare, 20);
        Poem poem2 = new Poem(pushkin, 15);
        Poem poem3 = new Poem(neruda, 30);

        Poem[] poems = {poem1, poem2, poem3};

        String longestPoemAuthor = findLongestPoemAuthor(poems);

        System.out.println("Author of the longest poem: " + longestPoemAuthor);
    }

    public static String findLongestPoemAuthor(Poem[] poems) {
        int maxStrophes = 0;
        Poem longestAuthor = null;
        for (Poem poem : poems) {
            if (poem.getStropheNumbers() > maxStrophes) {
                maxStrophes = poem.getStropheNumbers();
                longestAuthor = poem;
            }
        }

        return longestAuthor.getCreator().getSurname();
    }
}
