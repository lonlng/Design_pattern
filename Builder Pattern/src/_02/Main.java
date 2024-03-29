package _02;

public class Main {

    public static void main(String[] args) {
        //String choice="plain";
        String choice = "plain";
        if (choice == "plain") {
            Builder t = new TextBuilder();
            Director d = new Director(t);
            d.construct();
            System.out.println(t.getResult());
        } else if (choice == "html") {
            Builder html = new HtmlBuilder();
            Director d = new Director(html);
            d.construct();
            System.out.println(html.getResult());
        } else {
            usage();
        }

    }

    private static void usage() {
        System.out.println("使用 plain，编辑文本文件");
        System.out.println("使用 html，编辑网页文件");
    }

}
