package Java.DesignPattern.Proxy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProxyTest {

    @Test
    void normalProxy() {
        // 직접 호출하지 않고 프록시를 호출
        IService proxy = new Proxy(new Service());
        proxy.runSomething();
    }

    @Test
    void virtualProxy() {
        // 직접 호출하지 않고 프록시를 호출
        IService2 proxy = new Proxy2();
        proxy.runSomething();
    }

    @Test
    void protectionProxy() {
        // 직접 호출하지 않고 프록시를 호출
        IService3 proxy = new Proxy3(new Service(),true);
        proxy.runSomething();
    }

    @Test
    void LoggingProxy() {
        // 직접 호출하지 않고 프록시를 호출
        IService4 proxy = new Proxy4(new Service());
        proxy.runSomething();
    }

    @Test
    void ImageViewTest() {
        HighResolutionImage highResolutionImage1 = new HighResolutionImage("./img/고해상도 이미지1");
        HighResolutionImage highResolutionImage2 = new HighResolutionImage("./img/고해상도 이미지2");
        HighResolutionImage highResolutionImage3 = new HighResolutionImage("./img/고해상도 이미지3");

        highResolutionImage2.showImage();
    }

    @Test
    void ImageViewTest2() {
        IImage2 highResolutionImage1 = new ImageProxy("./img/고해상도 이미지1");
        IImage2 highResolutionImage2 = new ImageProxy("./img/고해상도 이미지2");
        IImage2 highResolutionImage3 = new ImageProxy("./img/고해상도 이미지3");

        highResolutionImage2.showImage();
    }

    @Test
    void ProtectionTest1() {
        // 직원별 개인 객체 생성
        Employee CTO = new Employee("A", RESPONSIBILITY.DIRECTOR);
        Employee devManager = new Employee("B", RESPONSIBILITY.MANAGER);
        Employee financeManager = new Employee("C", RESPONSIBILITY.MANAGER);
        Employee devStaff = new Employee("D", RESPONSIBILITY.STAFF);
        Employee financeStaff = new Employee("E", RESPONSIBILITY.STAFF);

        // 직원들 리스트로 가공
        List<Employee> employees = Arrays.asList(CTO, devManager, financeManager, devStaff, financeStaff);

        // 회사 정보를 조회하는 직책
        Employee me = new Employee("F", RESPONSIBILITY.STAFF);

        System.out.println("===============================================");
        System.out.println("시나리오1. 사원이 회사 정보를 조회ing...");
        System.out.println("===============================================");

        PrintEmployeeInfo view = new PrintEmployeeInfo(me);
        view.printAllInfo(employees);
    }

    @Test
    void ProtectionTest2() {
        // 직원별 개인 객체 생성
        Employee2 CTO = new Employee2("A", RESPONSIBILITY.DIRECTOR);
        Employee2 devManager = new Employee2("B", RESPONSIBILITY.MANAGER);
        Employee2 financeManager = new Employee2("C", RESPONSIBILITY.MANAGER);
        Employee2 devStaff = new Employee2("D", RESPONSIBILITY.STAFF);
        Employee2 financeStaff = new Employee2("E", RESPONSIBILITY.STAFF);

        // 직원들 리스트로 가공
        List<Employee2> employees = Arrays.asList(CTO, devManager, financeManager, devStaff, financeStaff);

        // 기존에 등록된 리스트를 수정할 수 없으나, 동적으로 기존의 Employee2 객체를
        // 프록시 객체 ProtectedEmployee로 Wrap하는 작업을 실행
        List<IEmployee> protectedProxy = new ArrayList<>();
        for(Employee2 e : employees) {
            protectedProxy.add(new ProtectedProxy((IEmployee) e));
        }

        // 회사 정보를 조회하는 직책
        Employee2 me = new Employee2("F", RESPONSIBILITY.STAFF);

        System.out.println("===============================================");
        System.out.println("시나리오1. 사원이 회사 정보를 조회ing...");
        System.out.println("===============================================");

        PrintEmployeeInfo2 view = new PrintEmployeeInfo2(me);
        view.printAllInfo(protectedProxy);

        System.out.println("===============================================");
        System.out.println("시나리오2. 고장이 회사 정보 조회ing...");
        System.out.println("===============================================");

        PrintEmployeeInfo2 view2 = new PrintEmployeeInfo2(devManager);
        view2.printAllInfo(protectedProxy);

        System.out.println("===============================================");
        System.out.println("시나리오2. 상무님이 회사 정보 조회ing...");
        System.out.println("===============================================");

        PrintEmployeeInfo2 view3 = new PrintEmployeeInfo2(CTO);
        view3.printAllInfo(protectedProxy);
    }
}