public class CitySales {

    private String cityName;
    private int ps5Sales;
    private int xboxSales;
    private int switchSales;

    public CitySales(String cityName, int ps5Sales, int xboxSales, int switchSales) {
        this.cityName = cityName;
        this.ps5Sales = ps5Sales;
        this.xboxSales = xboxSales;
        this.switchSales = switchSales;
    }

    public String getCityName() {
        return cityName;
    }

    public int getTotalSales() {
        return ps5Sales + xboxSales + switchSales;
    }

    public void displaySales() {
        System.out.printf(
                "%-20s %-10d %-10d %-10d%n",
                cityName,
                ps5Sales,
                xboxSales,
                switchSales
        );
    }
}
