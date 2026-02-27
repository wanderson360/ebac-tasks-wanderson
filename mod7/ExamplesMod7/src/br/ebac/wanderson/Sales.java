package br.ebac.wanderson;

/**
 * Classe responsável pelo faturamento das vendas
 *
 * @author wanderson
 */
public class Sales {
    private int orderNumber;
    private int quantity;
    private double grossTotal;
    private double discountTotal;
    private double netTotal;

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setGrossTotal(double grossTotal) {
        this.grossTotal = grossTotal;
    }

    public void setDiscountTotal(double discountTotal) {
        this.discountTotal = discountTotal;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getGrossTotal() {
        return grossTotal;
    }

    public double getDiscountTotal() {
        return discountTotal;
    }

    public double getNetTotal() {
        return netTotal;
    }
    // Calcula o valor líquido da venda
    private void calculateTotalNet() {
        this.netTotal = this.grossTotal - this.discountTotal;
    }

}
