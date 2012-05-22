tagsoup-html5
=============

Generated HTML5 Schema and Models for Tagsoup.

Usage:

    try {
      InputSource is = new InputSource(new StringReader(text));
      parser.setFeature(Parser.defaultAttributesFeature, false);

      // HTML 5 Schema
      parser.setProperty(Parser.schemaProperty, new HTML5Schema());
            
      parser.parse(is);
    } catch (IOException e) {
      throw new IllegalStateException(e);
    } catch (SAXException e) {
      throw new IllegalStateException("HTML cleanup error", e);
    }
