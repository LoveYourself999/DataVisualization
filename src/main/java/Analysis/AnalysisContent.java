package Analysis;

public class AnalysisContent {
        private AnalysisStrategy strategy;


        public AnalysisStrategy getStrategy()
        {
            return strategy;
        }

    public void setStrategy(AnalysisStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(){
            strategy.displayChart();
        }
}
