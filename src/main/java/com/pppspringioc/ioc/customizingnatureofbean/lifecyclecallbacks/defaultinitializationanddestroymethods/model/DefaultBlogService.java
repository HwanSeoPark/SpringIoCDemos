package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.defaultinitializationanddestroymethods.model;

public class DefaultBlogService {

    private BlogDao blogDao;

    public void setBlogDao(BlogDao blogDao) {
        this.blogDao = blogDao;
    }

    // 초기화 콜백 메서드
    public void init() {
        System.out.println("DefaultBlogService: Initialization logic executed.");
        if (this.blogDao == null) {
            throw new IllegalStateException("The [blogDao] property must be set.");
        }
    }

    // 파괴 콜백 메서드
    public void destroy() {
        System.out.println("DefaultBlogService: Destruction logic executed.");
    }
}
