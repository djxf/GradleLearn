package com.djxf.buildsrc;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;


public class TestPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.task("testdjxf").doLast(new Action<Task>() {
            @Override
            public void execute(Task task) {
                System.out.println("TestPlugin apply");
                throw new IllegalArgumentException();
            }
        });
    }
}
