/***************************************************************
 * Copyright (c) 2014 - 2015 , gurkenlabs, All rights reserved *
 ***************************************************************/
package de.gurkenlabs.tests.litiengine;

import static org.junit.Assert.*;

import org.junit.Test;

import de.gurkenlabs.litiengine.attributes.Attribute;
import de.gurkenlabs.litiengine.attributes.AttributeModifier;
import de.gurkenlabs.litiengine.attributes.Modification;

/**
 * The Class AttributeTests.
 */
public class AttributeTests {

  @Test
  public void testAddModification() {
    final Attribute<Byte> testAttributeByte = new Attribute<>((byte) 10);
    final Attribute<Short> testAttributeShort = new Attribute<>((short) 10);
    final Attribute<Integer> testAttributeInt = new Attribute<>(10);
    final Attribute<Long> testAttributeLong = new Attribute<>(10L);

    final Attribute<Float> testAttributeFloat = new Attribute<>(10.0f);
    final Attribute<Double> testAttributeDouble = new Attribute<>(10.0);

    testAttributeByte.modifyBaseValue(new AttributeModifier<Byte>(Modification.ADD, (byte) 100));
    testAttributeShort.modifyBaseValue(new AttributeModifier<Short>(Modification.ADD, (short) 100));
    testAttributeInt.modifyBaseValue(new AttributeModifier<Integer>(Modification.ADD, 100));
    testAttributeLong.modifyBaseValue(new AttributeModifier<Long>(Modification.ADD, 1000L));

    testAttributeFloat.modifyBaseValue(new AttributeModifier<Float>(Modification.ADD, 101.1f));
    testAttributeDouble.modifyBaseValue(new AttributeModifier<Double>(Modification.ADD, 101.1));

    assertEquals((byte) 110, testAttributeByte.getCurrentValue().byteValue());
    assertEquals((short) 110, testAttributeByte.getCurrentValue().byteValue());
    assertEquals(110, testAttributeInt.getCurrentValue().intValue());
    assertEquals(1010L, testAttributeLong.getCurrentValue().longValue());

    assertEquals(111.1f, testAttributeFloat.getCurrentValue().floatValue(), 0.0001f);
    assertEquals(111.1, testAttributeDouble.getCurrentValue().doubleValue(), 0.0000001);
  }

  @Test
  public void testAddPercentModification() {
    final Attribute<Byte> testAttributeByte = new Attribute<>((byte) 10);
    final Attribute<Short> testAttributeShort = new Attribute<>((short) 10);
    final Attribute<Integer> testAttributeInt = new Attribute<>(10);
    final Attribute<Long> testAttributeLong = new Attribute<>(10L);

    final Attribute<Float> testAttributeFloat = new Attribute<>(10.0f);
    final Attribute<Double> testAttributeDouble = new Attribute<>(10.0);

    testAttributeByte.modifyBaseValue(new AttributeModifier<Byte>(Modification.ADDPERCENT, 10));
    testAttributeShort.modifyBaseValue(new AttributeModifier<Short>(Modification.ADDPERCENT, 10));
    testAttributeInt.modifyBaseValue(new AttributeModifier<Integer>(Modification.ADDPERCENT, 10));
    testAttributeLong.modifyBaseValue(new AttributeModifier<Long>(Modification.ADDPERCENT, 10));

    testAttributeFloat.modifyBaseValue(new AttributeModifier<Float>(Modification.ADDPERCENT, 11));
    testAttributeDouble.modifyBaseValue(new AttributeModifier<Double>(Modification.ADDPERCENT, 11));

    assertEquals((byte) 11, testAttributeByte.getCurrentValue().byteValue());
    assertEquals((short) 11, testAttributeByte.getCurrentValue().byteValue());
    assertEquals(11, testAttributeInt.getCurrentValue().intValue());
    assertEquals(11L, testAttributeLong.getCurrentValue().longValue());

    assertEquals(11.1f, testAttributeFloat.getCurrentValue().floatValue(), 0.0001f);
    assertEquals(11.1, testAttributeDouble.getCurrentValue().doubleValue(), 0.0000001);
  }

  @Test
  public void testAttributeInitialization() {
    final Attribute<Integer> testAttribute = new Attribute<>(10);
    assertEquals(10, testAttribute.getCurrentValue().intValue());
  }

  @Test
  public void testDivideModification() {
    final Attribute<Byte> testAttributeByte = new Attribute<>((byte) 10);
    final Attribute<Short> testAttributeShort = new Attribute<>((short) 10);
    final Attribute<Integer> testAttributeInt = new Attribute<>(10);
    final Attribute<Long> testAttributeLong = new Attribute<>(10L);

    final Attribute<Float> testAttributeFloat = new Attribute<>(10.0f);
    final Attribute<Double> testAttributeDouble = new Attribute<>(10.0);

    testAttributeByte.modifyBaseValue(new AttributeModifier<Byte>(Modification.DIVIDE, 2));
    testAttributeShort.modifyBaseValue(new AttributeModifier<Short>(Modification.DIVIDE, 2));
    testAttributeInt.modifyBaseValue(new AttributeModifier<Integer>(Modification.DIVIDE, 2));
    testAttributeLong.modifyBaseValue(new AttributeModifier<Long>(Modification.DIVIDE, 2));

    testAttributeFloat.modifyBaseValue(new AttributeModifier<Float>(Modification.DIVIDE, 3));
    testAttributeDouble.modifyBaseValue(new AttributeModifier<Double>(Modification.DIVIDE, 3));

    assertEquals((byte) 5, testAttributeByte.getCurrentValue().byteValue());
    assertEquals((short) 5, testAttributeByte.getCurrentValue().byteValue());
    assertEquals(5, testAttributeInt.getCurrentValue().intValue());
    assertEquals(5L, testAttributeLong.getCurrentValue().longValue());

    assertEquals(3.333333333333f, testAttributeFloat.getCurrentValue().floatValue(), 0.0001f);
    assertEquals(3.333333333333, testAttributeDouble.getCurrentValue().doubleValue(), 0.0000001);
  }

  @Test
  public void testMultiplyModification() {
    final Attribute<Byte> testAttributeByte = new Attribute<>((byte) 10);
    final Attribute<Short> testAttributeShort = new Attribute<>((short) 10);
    final Attribute<Integer> testAttributeInt = new Attribute<>(10);
    final Attribute<Long> testAttributeLong = new Attribute<>(10L);

    final Attribute<Float> testAttributeFloat = new Attribute<>(10.0f);
    final Attribute<Double> testAttributeDouble = new Attribute<>(10.0);

    testAttributeByte.modifyBaseValue(new AttributeModifier<Byte>(Modification.MULTIPLY, 2));
    testAttributeShort.modifyBaseValue(new AttributeModifier<Short>(Modification.MULTIPLY, 2));
    testAttributeInt.modifyBaseValue(new AttributeModifier<Integer>(Modification.MULTIPLY, 2));
    testAttributeLong.modifyBaseValue(new AttributeModifier<Long>(Modification.MULTIPLY, 2));

    testAttributeFloat.modifyBaseValue(new AttributeModifier<Float>(Modification.MULTIPLY, 2.1));
    testAttributeDouble.modifyBaseValue(new AttributeModifier<Double>(Modification.MULTIPLY, 2.1));

    assertEquals((byte) 20, testAttributeByte.getCurrentValue().byteValue());
    assertEquals((short) 20, testAttributeByte.getCurrentValue().byteValue());
    assertEquals(20, testAttributeInt.getCurrentValue().intValue());
    assertEquals(20L, testAttributeLong.getCurrentValue().longValue());

    assertEquals(21f, testAttributeFloat.getCurrentValue().floatValue(), 0.0001f);
    assertEquals(21, testAttributeDouble.getCurrentValue().doubleValue(), 0.0000001);
  }

  @Test
  public void testSetModification() {
    final Attribute<Byte> testAttributeByte = new Attribute<>((byte) 10);
    final Attribute<Short> testAttributeShort = new Attribute<>((short) 10);
    final Attribute<Integer> testAttributeInt = new Attribute<>(10);
    final Attribute<Long> testAttributeLong = new Attribute<>(10L);

    final Attribute<Float> testAttributeFloat = new Attribute<>(10.0f);
    final Attribute<Double> testAttributeDouble = new Attribute<>(10.0);

    testAttributeByte.modifyBaseValue(new AttributeModifier<Byte>(Modification.SET, 20));
    testAttributeShort.modifyBaseValue(new AttributeModifier<Short>(Modification.SET, 20));
    testAttributeInt.modifyBaseValue(new AttributeModifier<Integer>(Modification.SET, 20));
    testAttributeLong.modifyBaseValue(new AttributeModifier<Long>(Modification.SET, 20));

    testAttributeFloat.modifyBaseValue(new AttributeModifier<Float>(Modification.SET, 21));
    testAttributeDouble.modifyBaseValue(new AttributeModifier<Double>(Modification.SET, 21));

    assertEquals((byte) 20, testAttributeByte.getCurrentValue().byteValue());
    assertEquals((short) 20, testAttributeByte.getCurrentValue().byteValue());
    assertEquals(20, testAttributeInt.getCurrentValue().intValue());
    assertEquals(20L, testAttributeLong.getCurrentValue().longValue());

    assertEquals(21f, testAttributeFloat.getCurrentValue().floatValue(), 0.0001f);
    assertEquals(21, testAttributeDouble.getCurrentValue().doubleValue(), 0.0000001);
  }

  @Test
  public void testSubstractModification() {
    final Attribute<Byte> testAttributeByte = new Attribute<>((byte) 10);
    final Attribute<Short> testAttributeShort = new Attribute<>((short) 10);
    final Attribute<Integer> testAttributeInt = new Attribute<>(10);
    final Attribute<Long> testAttributeLong = new Attribute<>(10L);

    final Attribute<Float> testAttributeFloat = new Attribute<>(10.0f);
    final Attribute<Double> testAttributeDouble = new Attribute<>(10.0);

    testAttributeByte.modifyBaseValue(new AttributeModifier<Byte>(Modification.SUBSTRACT, (byte) 1));
    testAttributeShort.modifyBaseValue(new AttributeModifier<Short>(Modification.SUBSTRACT, (short) 1));
    testAttributeInt.modifyBaseValue(new AttributeModifier<Integer>(Modification.SUBSTRACT, 1));
    testAttributeLong.modifyBaseValue(new AttributeModifier<Long>(Modification.SUBSTRACT, 1));

    testAttributeFloat.modifyBaseValue(new AttributeModifier<Float>(Modification.SUBSTRACT, 0.9f));
    testAttributeDouble.modifyBaseValue(new AttributeModifier<Double>(Modification.SUBSTRACT, 0.9));

    assertEquals((byte) 9, testAttributeByte.getCurrentValue().byteValue());
    assertEquals((short) 9, testAttributeByte.getCurrentValue().byteValue());
    assertEquals(9, testAttributeInt.getCurrentValue().intValue());
    assertEquals(9L, testAttributeLong.getCurrentValue().longValue());

    assertEquals(9.1f, testAttributeFloat.getCurrentValue().floatValue(), 0.0001f);
    assertEquals(9.1, testAttributeDouble.getCurrentValue().doubleValue(), 0.0000001);
  }

  @Test
  public void testSubstractPercentModification() {
    final Attribute<Byte> testAttributeByte = new Attribute<>((byte) 10);
    final Attribute<Short> testAttributeShort = new Attribute<>((short) 10);
    final Attribute<Integer> testAttributeInt = new Attribute<>(10);
    final Attribute<Long> testAttributeLong = new Attribute<>(10L);

    final Attribute<Float> testAttributeFloat = new Attribute<>(10.0f);
    final Attribute<Double> testAttributeDouble = new Attribute<>(10.0);

    testAttributeByte.modifyBaseValue(new AttributeModifier<Byte>(Modification.SUBSTRACTPERCENT, 10));
    testAttributeShort.modifyBaseValue(new AttributeModifier<Short>(Modification.SUBSTRACTPERCENT, 10));
    testAttributeInt.modifyBaseValue(new AttributeModifier<Integer>(Modification.SUBSTRACTPERCENT, 10));
    testAttributeLong.modifyBaseValue(new AttributeModifier<Long>(Modification.SUBSTRACTPERCENT, 10));

    testAttributeFloat.modifyBaseValue(new AttributeModifier<Float>(Modification.SUBSTRACTPERCENT, 9));
    testAttributeDouble.modifyBaseValue(new AttributeModifier<Double>(Modification.SUBSTRACTPERCENT, 9));

    assertEquals((byte) 9, testAttributeByte.getCurrentValue().byteValue());
    assertEquals((short) 9, testAttributeByte.getCurrentValue().byteValue());
    assertEquals(9, testAttributeInt.getCurrentValue().intValue());
    assertEquals(9L, testAttributeLong.getCurrentValue().longValue());

    assertEquals(9.1f, testAttributeFloat.getCurrentValue().floatValue(), 0.0001f);
    assertEquals(9.1, testAttributeDouble.getCurrentValue().doubleValue(), 0.0000001);
  }
}
