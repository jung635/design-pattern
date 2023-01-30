package me.whiteship.designpatterns._01_creational_patterns._05_prototype._02_after.sunju;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue)githubIssue.clone();
        System.out.println(clone.getUrl());
        //TODO clone != githubIssue
        //TODO clone.equals(githubIssue) => true (데이터를 확인하는 것이므로)

        System.out.println(clone != githubIssue); //true(shallow) / true(deep)
        System.out.println(clone.equals(githubIssue)); //true(shallow) / false(deep)
        System.out.println(clone.getClass() == githubIssue.getClass()); //true(shallow) / true(deep)
        //java에서 제공하는 clone은 shallow copy -> 내부에 가지고 있는 Repository는 같음.
        System.out.println(clone.getRepository() == githubIssue.getRepository());//true(shallow) / false(deep)
        // ==> 기존의 레퍼런스를 그대로 가지고 있기 때문에, repository의 이름이 바뀌면 clone에도 영향을 준다.
        // 필요 시, deep copy가 되도록 만들어야한다.
    }

}
