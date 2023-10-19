package solution


interface SolutionInterface<T, R> {

    fun solution(param: T) : R

    fun solutionTimeCheck(param: T) {
        /// start
        this.solution(param)
        ///end
    }

    fun solutionLoop(param: T, count: Int) {
        /// start
        for (i in 0..<count){
            this.solution(param)
        }
        ///end
    }

    fun solutionTimeCheckLoop(param: T, count: Int) {
        /// start all
        for (i in 0..<count){
            this.solutionTimeCheck(param)
        }
        /// end all
    }

}

interface MultiInputSolutionInterface<T, R> {

}