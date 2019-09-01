package Hibernate.IMPL;

import Hibernate.Custom.CourseHIB;
import Hibernate.Entity.Course;

import java.util.List;

public class CourseHIBimpl implements CourseHIB {

    @Override
    public boolean add(Course dto) throws Exception {
        return false;
    }

    @Override
    public boolean update(Course dto) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public Course search(String s) throws Exception {
        return null;
    }

    @Override
    public List<Course> getAll() throws Exception {
        return null;
    }
}
