package exercise.entity;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id")
    private int blogId;

    @Column(name="blog_content", length=150)
    private String content;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category_id;

    public Blog() {
    }

    public Blog(int blogId, String content, Category category_id) {
        this.blogId = blogId;
        this.content = content;
        this.category_id = category_id;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", content='" + content + '\'' +
                ", category_id=" + category_id +
                '}';
    }
}
