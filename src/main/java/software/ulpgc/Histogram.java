package software.ulpgc;

import java.util.Map;

public record Histogram(String name, String xAxis, String yAxis, Map<String, Integer> data) {
}
