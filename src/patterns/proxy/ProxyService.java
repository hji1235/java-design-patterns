package patterns.proxy;

public class ProxyService implements Service{

    private RealService realService;
    @Override
    public void request() {
        if (realService == null) {
            realService = new RealService();
        }
        System.out.println("ProxyService.request : 실제 서비스 요청 전 추가 작업 수행");
        realService.request();
        System.out.println("ProxyService.request : 실제 서비스 요청 후 추가 작업 수행");
    }
}
