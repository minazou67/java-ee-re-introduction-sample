package org.minazou67.sample.ee6.validation;

import java.util.List;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SampleBean {

	@NotNull
	private String notNull;
	// Min・Max
	@Min(-10)
	int intMin;
	@Max(10)
	int intMax;
	// Decimal Min・Max
	@DecimalMin("-10.5")
	@DecimalMax("10.5")
	String stringMinMax;
	// Size
	@NotNull
	@Size(max = 10, message = "{max} 文字以内である必要があります。")
	String stringSize;
	@Size(min = 0, max = 10)
	List<Integer> listSize;
	// Pattern
	@Pattern(regexp = "[0-9]+")
	private String stringPattern;
	// getter/setter
	/**
	 * notNullを取得します。
	 * @return notNull
	 */
	public String getNotNull() {
	    return notNull;
	}
	/**
	 * notNullを設定します。
	 * @param notNull notNull
	 */
	public void setNotNull(String notNull) {
	    this.notNull = notNull;
	}
	/**
	 * intMinを取得します。
	 * @return intMin
	 */
	public int getIntMin() {
	    return intMin;
	}
	/**
	 * intMinを設定します。
	 * @param intMin intMin
	 */
	public void setIntMin(int intMin) {
	    this.intMin = intMin;
	}
	/**
	 * intMaxを取得します。
	 * @return intMax
	 */
	public int getIntMax() {
	    return intMax;
	}
	/**
	 * intMaxを設定します。
	 * @param intMax intMax
	 */
	public void setIntMax(int intMax) {
	    this.intMax = intMax;
	}
	/**
	 * stringMinMaxを取得します。
	 * @return stringMinMax
	 */
	public String getStringMinMax() {
	    return stringMinMax;
	}
	/**
	 * stringMinMaxを設定します。
	 * @param stringMinMax stringMinMax
	 */
	public void setStringMinMax(String stringMinMax) {
	    this.stringMinMax = stringMinMax;
	}
	/**
	 * stringSizeを取得します。
	 * @return stringSize
	 */
	public String getStringSize() {
	    return stringSize;
	}
	/**
	 * stringSizeを設定します。
	 * @param stringSize stringSize
	 */
	public void setStringSize(String stringSize) {
	    this.stringSize = stringSize;
	}
	/**
	 * listSizeを取得します。
	 * @return listSize
	 */
	public List<Integer> getListSize() {
	    return listSize;
	}
	/**
	 * listSizeを設定します。
	 * @param listSize listSize
	 */
	public void setListSize(List<Integer> listSize) {
	    this.listSize = listSize;
	}
	/**
	 * stringPatternを取得します。
	 * @return stringPattern
	 */
	public String getStringPattern() {
	    return stringPattern;
	}
	/**
	 * stringPatternを設定します。
	 * @param stringPattern stringPattern
	 */
	public void setStringPattern(String stringPattern) {
	    this.stringPattern = stringPattern;
	}
}
