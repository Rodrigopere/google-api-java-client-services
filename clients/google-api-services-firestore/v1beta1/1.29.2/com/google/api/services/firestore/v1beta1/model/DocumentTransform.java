/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.firestore.v1beta1.model;

/**
 * A transformation of a document.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DocumentTransform extends com.google.api.client.json.GenericJson {

  /**
   * The name of the document to transform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String document;

  /**
   * The list of transformations to apply to the fields of the document, in order. This must not be
   * empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FieldTransform> fieldTransforms;

  /**
   * The name of the document to transform.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocument() {
    return document;
  }

  /**
   * The name of the document to transform.
   * @param document document or {@code null} for none
   */
  public DocumentTransform setDocument(java.lang.String document) {
    this.document = document;
    return this;
  }

  /**
   * The list of transformations to apply to the fields of the document, in order. This must not be
   * empty.
   * @return value or {@code null} for none
   */
  public java.util.List<FieldTransform> getFieldTransforms() {
    return fieldTransforms;
  }

  /**
   * The list of transformations to apply to the fields of the document, in order. This must not be
   * empty.
   * @param fieldTransforms fieldTransforms or {@code null} for none
   */
  public DocumentTransform setFieldTransforms(java.util.List<FieldTransform> fieldTransforms) {
    this.fieldTransforms = fieldTransforms;
    return this;
  }

  @Override
  public DocumentTransform set(String fieldName, Object value) {
    return (DocumentTransform) super.set(fieldName, value);
  }

  @Override
  public DocumentTransform clone() {
    return (DocumentTransform) super.clone();
  }

}
