# MapBinderExample
an example for using Guice MapBinder and Named binding annotations

We recently implemented a storage api in which some customers data was on a NAS device and some would be S3 and potentially other types of storage.

We decided on using Guice to implement our storage api for better TDD. This sample code shows the basics of using MapBinder and Named binding annotations.
