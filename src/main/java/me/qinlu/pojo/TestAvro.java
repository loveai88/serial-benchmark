/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package me.qinlu.pojo;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TestAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TestAvro\",\"namespace\":\"me.qinlu.pojo\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public TestAvro() {}

  /**
   * All-args constructor.
   */
  public TestAvro(java.lang.CharSequence id) {
    this.id = id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /** Creates a new TestAvro RecordBuilder */
  public static me.qinlu.pojo.TestAvro.Builder newBuilder() {
    return new me.qinlu.pojo.TestAvro.Builder();
  }
  
  /** Creates a new TestAvro RecordBuilder by copying an existing Builder */
  public static me.qinlu.pojo.TestAvro.Builder newBuilder(me.qinlu.pojo.TestAvro.Builder other) {
    return new me.qinlu.pojo.TestAvro.Builder(other);
  }
  
  /** Creates a new TestAvro RecordBuilder by copying an existing TestAvro instance */
  public static me.qinlu.pojo.TestAvro.Builder newBuilder(me.qinlu.pojo.TestAvro other) {
    return new me.qinlu.pojo.TestAvro.Builder(other);
  }
  
  /**
   * RecordBuilder for TestAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TestAvro>
    implements org.apache.avro.data.RecordBuilder<TestAvro> {

    private java.lang.CharSequence id;

    /** Creates a new Builder */
    private Builder() {
      super(me.qinlu.pojo.TestAvro.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(me.qinlu.pojo.TestAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing TestAvro instance */
    private Builder(me.qinlu.pojo.TestAvro other) {
            super(me.qinlu.pojo.TestAvro.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public me.qinlu.pojo.TestAvro.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public me.qinlu.pojo.TestAvro.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public TestAvro build() {
      try {
        TestAvro record = new TestAvro();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
