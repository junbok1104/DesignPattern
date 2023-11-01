package Java.DesignPattern.Proxy;

import java.util.List;

public class PrintEmployeeInfo2 {
    IEmployee viewer; // 조회하고자 하는 직위

    public PrintEmployeeInfo2(IEmployee viewer) {
        this.viewer = viewer;
    }

    // Employee 객체 리스트를 받아 직원들의 정보를 순회하여 조회
    void printAllInfo(List<IEmployee> employees) {
        employees.stream()
                .map(employee -> employee.getInfo(viewer))
                .forEach(System.out::println);
    }
}