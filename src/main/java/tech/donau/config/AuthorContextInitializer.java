package tech.donau.config;

import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;
import tech.donau.data.Author;

@AutoProtoSchemaBuilder(includeClasses = { Author.class }, schemaPackageName = "author_sample")
interface AuthorContextInitializer extends SerializationContextInitializer {
}
