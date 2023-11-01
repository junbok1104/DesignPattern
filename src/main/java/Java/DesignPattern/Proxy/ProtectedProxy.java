package Java.DesignPattern.Proxy;


public class ProtectedProxy implements IEmployee {
    private IEmployee employee;
    public ProtectedProxy(IEmployee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public RESPONSIBILITY getPosition() {
        return employee.getPosition();
    }

    @Override
    public String getInfo(IEmployee viewer) {
        // 조회 되는 사람들의 직책 가져오기
        RESPONSIBILITY position = this.employee.getPosition();

        // 매개변수로 받은 조회자의 직책에 따라 출력을 제어
        switch (viewer.getPosition()) {
            case DIRECTOR:
                // 상무님은 과장, 사원들을 볼 수 있다.
                return this.employee.getInfo(viewer);
            case MANAGER:
                // 과장님은 과장, 사원들의 정보를 조회할 수 있고, 상무님은 조회 불가능
                if(position != RESPONSIBILITY.DIRECTOR) {
                    return this.employee.getInfo(viewer);
                }
            case STAFF:
                // 사원은 같은 직급인 사람들만 볼 수 있다. 과장, 상무의 정보는 볼 수 없다
                if(position != RESPONSIBILITY.DIRECTOR && position != RESPONSIBILITY.MANAGER) {
                    return this.employee.getInfo(viewer);
                }
            default: return "다른 사람의 정보를 조회할 수 없습니다.";
        }
    }
}