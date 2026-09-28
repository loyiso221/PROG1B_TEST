public class SalesReport {

    private CitySales[] cities;

    public SalesReport() {

        cities = new CitySales[3];

        cities[0] = new CitySales(
                "CAPE TOWN",
                1000,
                2000,
                3000
        );

        cities[1] = new CitySales(
                "PORT ELIZABETH",
                2000,
                3000,
                4000
        );

        cities[2] = new CitySales(
                "PRETORIA",
                1500,
                1100,
                1200
        );
    }

    public void printReport() {

        System.out.println("-----------------------------------------------");
        System.out.println("             GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------------");

        System.out.printf(
                "%-20s %-10s %-10s %-10s%n",
                "",
                "PS5",
                "XBOX",
                "SWITCH"
        );

        for (int i = 0; i < cities.length; i++) {
            cities[i].displaySales();
        }

        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("       CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf(
                    "%-20s %d%n",
                    cities[i].getCityName(),
                    cities[i].getTotalSales()
            );
        }

        findCityWithMostSales();
    }

    private void findCityWithMostSales() {

        int highestSales = cities[0].getTotalSales();
        String highestCity = cities[0].getCityName();

        for (int i = 1; i < cities.length; i++) {

            if (cities[i].getTotalSales() > highestSales) {

                highestSales = cities[i].getTotalSales();
                highestCity = cities[i].getCityName();
            }
        }

        System.out.println();
        System.out.println(
                "CITY WITH THE MOST SALES: " + highestCity
        );

        System.out.println("-----------------------------------------------");
    }
}
