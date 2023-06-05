import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MemoInput {

    private ArrayList<Memo> memos;
    private int contentNumber;
    public MemoInput(){
        memos = new ArrayList<>();
        contentNumber = 0;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("이름");
        String name = sc.nextLine();

        System.out.println("제목");
        String title = sc.nextLine();

        System.out.println("내용");
        String memoContent = sc.nextLine();

        System.out.println("비밀 번호");
        int passWord = sc.nextInt();

        LocalDateTime localDateTime = LocalDateTime.now();

        memos.add(new Memo(++contentNumber, name,title, memoContent,passWord,localDateTime));

    }

    public List<Memo> getMemos() {
        return memos;
    }


}
