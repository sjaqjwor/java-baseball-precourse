package baseball.referee;

import java.util.Objects;

public class RefereeResult {

    private CompareResult compareResult;
    private String hint;

    public RefereeResult(CompareResult compareResult, String hint) {
        this.compareResult = compareResult;
        this.hint = hint;
    }

    public RefereeResult(CompareResult compareResult) {
        this.compareResult = compareResult;
    }

    public static RefereeResult create(CompareResult compareResult, String hint) {
        return new RefereeResult(compareResult, hint);
    }

    public static RefereeResult create(CompareResult compareResult) {
        return new RefereeResult(compareResult);
    }

    public CompareResult getCompareResult() {
        return compareResult;
    }

    public String getHint() {
        return hint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RefereeResult that = (RefereeResult) o;
        return compareResult == that.compareResult &&
                Objects.equals(hint, that.hint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareResult, hint);
    }

}
