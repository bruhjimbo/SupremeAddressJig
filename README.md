Supreme Address Jig
============
[![GitHub Stars](https://img.shields.io/github/stars/IgorAntun/node-chat.svg)](https://github.com/bruhjimbo/SupremeAddressJig/stargazers) [![GitHub Issues](https://img.shields.io/github/issues/IgorAntun/node-chat.svg)](https://github.com/bruhjimbo/SupremeAddressJig/issues) [![Current Version](https://img.shields.io/badge/version-1.0.7-green.svg)](https://github.com/bruhjimbo/SupremeAddressJig/node-chat)

## Table of contents
* [General info](#general-info)
* [Example Usage](#example-usage)

## General info
This is a very simple Java library to jig one's address for Supreme
	
## Example usage
Simple example usage of library
#### Example code
```
String[] jigged = SupremeAddressJig.address("123 Apple Street", 10);
		
for (int i=0; i<jigged.length; i++) {

  System.out.println(jigged[i]);

}
```
#### Example output
```
AB472 123 Apple Street
AB472 123 Apple Street
AB414 123 Apple Street
AB592 123 Apple Street
AB317 123 Apple Street
AB397 123 Apple Street
AB599 123 Apple Street
AB208 123 Apple Street
AB629 123 Apple Street
AB516 123 Apple Street
```
