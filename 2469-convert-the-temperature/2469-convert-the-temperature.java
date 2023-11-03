class Solution {
    public double[] convertTemperature(double c) {
        return new double[]{273.15 + c , (c * 1.8)+32};
        
    }
}