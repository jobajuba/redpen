package org.unigram.docvalidator.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Represent a character settings.
 */
public final class DVCharacter {
  /**
   * constructor.
   * @param charName name of target character
   * @param charValue character
   */
  public DVCharacter(String charName, String charValue) {
    this.name = charName;
    this.value = charValue;
    this.invalidChars = new ArrayList<String>();
    this.needBeforeSpace = false;
    this.needAfterSpace = false;
  }

  /**
   * constructor.
   * @param charName name of target character
   * @param charValue character
   * @param invalidChasStr list of invalid characters
   */
  public DVCharacter(String charName, String charValue,
      String invalidCharsStr) {
    this(charName, charValue);
    if (invalidCharsStr.length() > 0) {
      this.invalidChars = Arrays.asList(invalidCharsStr.split("(?!^)"));
    }
  }

  /**
   * constructor.
   * @param charName name of target character
   * @param charValue character
   * @param invalidChasStr list of invalid characters
   * @param haveBeforeSpace flag to have a space before the character
   * @param haveAfterSpace flag to have a pace after the character
   */
  public DVCharacter(String charName, String charValue, String invalidCharsStr,
      boolean haveBeforeSpace, boolean haveAfterSpace) {
    this(charName, charValue, invalidCharsStr);
    this.needBeforeSpace = haveBeforeSpace;
    this.needAfterSpace = haveAfterSpace;
  }

  /**
   * get name of character.
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * set name of character.
   * @param charName name of character
   */
  public void setName(String charName) {
    this.name = charName;
  }

  /**
   * get value of character.
   * @return character
   */
  public String getValue() {
    return value;
  }

  /**
   * set value of character.
   * @param charValue
   */
  public void setValue(String charValue) {
    this.value = charValue;
  }

  /**
   * get invalid characters.
   * @return a list of invalid characters
   */
  public List<String> getInvalidChars() {
    return invalidChars;
  }

  /**
   * set invalid characters.
   * @param invalidCharList list of invalid characters
   */
  public void setInvalidChars(List<String> invalidCharList) {
    this.invalidChars = invalidCharList;
  }

  /**
   * get the flag to know the character should have a space.
   * @return flag to determine the character should have a space before it
   */
  public boolean isNeedBeforeSpace() {
    return needBeforeSpace;
  }

  /**
   * set the flag to know the character should have a space.
   * @param beforeSpace the character should have a space before it
   */
  public void setNeedBeforeSpace(boolean beforeSpace) {
    this.needBeforeSpace = beforeSpace;
  }

  /**
   * get the flag to know the character should have a space.
   * @return flag to determine the character should have a space after it
   */
  public boolean isNeedAfterSpace() {
    return needAfterSpace;
  }

  /**
   * set the flag to know the character should have a space.
   * @param needBeforeSpace the character should have a space after it
   */
  public void setNeedAfterSpace(boolean afterSpace) {
    this.needAfterSpace = afterSpace;
  }

  private String name;
  private String value;
  private List<String> invalidChars;
  private boolean needBeforeSpace;
  private boolean needAfterSpace;
}
