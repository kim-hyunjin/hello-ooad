package hello.ooad.routefinder;

import hello.ooad.routefinder.loader.SubwayLoader;
import hello.ooad.routefinder.printer.SubwayPrinter;
import hello.ooad.routefinder.subway.Subway;

import java.io.File;
import java.util.List;

public class SubwayTester {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: SubwayTester [startStation] [endStation]");
            System.exit(-1);
        }
        try {
            SubwayLoader loader = new SubwayLoader();
            String fileName = LoadTester.class.getClassLoader().getResource("Subway.txt").getFile();
            if (fileName == null || fileName.equals("")) {
                System.out.println("\n지하철 노선 파일이 존재하지 않습니다.");
                System.exit(-1);
            }
            Subway seoulSubway = loader.loadFromFile(new File(fileName));
            if (!seoulSubway.hasStation(args[0])) {
                System.out.println(args[0] + " is not a station in Seoul.");
                System.exit(-1);
            } else if (!seoulSubway.hasStation(args[1])) {
                System.out.println(args[0] + " is not a station in Seoul.");
                System.exit(-1);
            }

            List route = seoulSubway.getDirections(args[0], args[1]);
            SubwayPrinter printer = new SubwayPrinter(System.out);
            printer.printDirections(route);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
