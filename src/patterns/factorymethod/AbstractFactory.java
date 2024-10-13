package patterns.factorymethod;

abstract class AbstractFactory {
    // 객체 생성 전처리 및 후처리 메서드 (오버라이딩 X, 템플릿화)
    final Product createOperation() {
        Product product = createProduct();
        product.setting();
        return product;
    }

    // 팩토리 메서드
    protected abstract Product createProduct();
}
