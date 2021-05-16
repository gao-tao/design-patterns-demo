package com.design.model.component;

import java.util.ArrayList;
import java.util.List;

public class CoursePackage extends CourseComponent {

    private List<CourseComponent> items = new ArrayList<>();

    private String name;

    private Integer level;

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(CourseComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void removeChild(CourseComponent catalogComponent) {
        super.removeChild(catalogComponent);
    }

    @Override
    public String getName(CourseComponent catalogComponent) {
        return this.name = name;
    }

    @Override
    public void print() {
        System.out.println(this.name);

        for (CourseComponent item : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("   ");
                }
                for (int i = 0; i < this.level; i++) {
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            item.print();
        }
    }
}
