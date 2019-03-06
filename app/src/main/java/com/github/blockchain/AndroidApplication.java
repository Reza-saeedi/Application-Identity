package com.github.blockchain;

import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple5;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Flowable;


/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.6.0.
 */
public class AndroidApplication extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060008054600160a060020a03191633179055612b07806100326000396000f3fe608060405234801561001057600080fd5b50600436106100a5576000357c010000000000000000000000000000000000000000000000000000000090048063a1a8858f11610078578063a1a8858f146109f9578063adc3730214610bb4578063cd5cfa0e14610c46578063df112d6d14610dfa576100a5565b80631c67d566146100aa57806322ae76da146104075780632304c933146106545780637972ecf91461080a575b600080fd5b6103f3600480360360c08110156100c057600080fd5b8101906020810181356401000000008111156100db57600080fd5b8201836020820111156100ed57600080fd5b8035906020019184600183028401116401000000008311171561010f57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929594936020810193503591505064010000000081111561016257600080fd5b82018360208201111561017457600080fd5b8035906020019184600183028401116401000000008311171561019657600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092959493602081019350359150506401000000008111156101e957600080fd5b8201836020820111156101fb57600080fd5b8035906020019184600183028401116401000000008311171561021d57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929594936020810193503591505064010000000081111561027057600080fd5b82018360208201111561028257600080fd5b803590602001918460018302840111640100000000831117156102a457600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092959493602081019350359150506401000000008111156102f757600080fd5b82018360208201111561030957600080fd5b8035906020019184600183028401116401000000008311171561032b57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929594936020810193503591505064010000000081111561037e57600080fd5b82018360208201111561039057600080fd5b803590602001918460018302840111640100000000831117156103b257600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550610fca945050505050565b604080519115158252519081900360200190f35b6106426004803603608081101561041d57600080fd5b81019060208101813564010000000081111561043857600080fd5b82018360208201111561044a57600080fd5b8035906020019184600183028401116401000000008311171561046c57600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092959493602081019350359150506401000000008111156104bf57600080fd5b8201836020820111156104d157600080fd5b803590602001918460018302840111640100000000831117156104f357600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929594936020810193503591505064010000000081111561054657600080fd5b82018360208201111561055857600080fd5b8035906020019184600183028401116401000000008311171561057a57600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092959493602081019350359150506401000000008111156105cd57600080fd5b8201836020820111156105df57600080fd5b8035906020019184600183028401116401000000008311171561060157600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092955061155a945050505050565b60408051918252519081900360200190f35b6103f36004803603608081101561066a57600080fd5b81019060208101813564010000000081111561068557600080fd5b82018360208201111561069757600080fd5b803590602001918460018302840111640100000000831117156106b957600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929594936020810193503591505064010000000081111561070c57600080fd5b82018360208201111561071e57600080fd5b8035906020019184600183028401116401000000008311171561074057600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929594936020810193503591505064010000000081111561079357600080fd5b8201836020820111156107a557600080fd5b803590602001918460018302840111640100000000831117156107c757600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092955050913592506115fa915050565b6108366004803603604081101561082057600080fd5b50600160a060020a038135169060200135611d43565b6040518080602001806020018060200186600160a060020a0316600160a060020a031681526020018060200185810385528a818151815260200191508051906020019080838360005b8381101561089757818101518382015260200161087f565b50505050905090810190601f1680156108c45780820380516001836020036101000a031916815260200191505b5085810384528951815289516020918201918b019080838360005b838110156108f75781810151838201526020016108df565b50505050905090810190601f1680156109245780820380516001836020036101000a031916815260200191505b5085810383528851815288516020918201918a019080838360005b8381101561095757818101518382015260200161093f565b50505050905090810190601f1680156109845780820380516001836020036101000a031916815260200191505b50858103825286518152865160209182019188019080838360005b838110156109b757818101518382015260200161099f565b50505050905090810190601f1680156109e45780820380516001836020036101000a031916815260200191505b50995050505050505050505060405180910390f35b61064260048036036080811015610a0f57600080fd5b81359190810190604081016020820135640100000000811115610a3157600080fd5b820183602082011115610a4357600080fd5b80359060200191846001830284011164010000000083111715610a6557600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050640100000000811115610ab857600080fd5b820183602082011115610aca57600080fd5b80359060200191846001830284011164010000000083111715610aec57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050640100000000811115610b3f57600080fd5b820183602082011115610b5157600080fd5b80359060200191846001830284011164010000000083111715610b7357600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550611fd2945050505050565b610bd160048036036020811015610bca57600080fd5b5035612300565b6040805160208082528351818301528351919283929083019185019080838360005b83811015610c0b578181015183820152602001610bf3565b50505050905090810190601f168015610c385780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b610bd160048036036060811015610c5c57600080fd5b810190602081018135640100000000811115610c7757600080fd5b820183602082011115610c8957600080fd5b80359060200191846001830284011164010000000083111715610cab57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050640100000000811115610cfe57600080fd5b820183602082011115610d1057600080fd5b80359060200191846001830284011164010000000083111715610d3257600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050640100000000811115610d8557600080fd5b820183602082011115610d9757600080fd5b80359060200191846001830284011164010000000083111715610db957600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092955061244c945050505050565b610fae60048036036060811015610e1057600080fd5b810190602081018135640100000000811115610e2b57600080fd5b820183602082011115610e3d57600080fd5b80359060200191846001830284011164010000000083111715610e5f57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050640100000000811115610eb257600080fd5b820183602082011115610ec457600080fd5b80359060200191846001830284011164010000000083111715610ee657600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050640100000000811115610f3957600080fd5b820183602082011115610f4b57600080fd5b80359060200191846001830284011164010000000083111715610f6d57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550612567945050505050565b60408051600160a060020a039092168252519081900360200190f35b6000610fe2610fda8888886125e7565b83878761155a565b15610fec57600080fd5b610ff4612972565b506040805160a0810182528881526020810188905290810186905233606082015260808101849052611024612972565b6004896040518082805190602001908083835b602083106110565780518252601f199092019160209182019101611037565b518151600019602094850361010090810a82019283169219939093169190911790925294909201968752604080519788900382018820805460c0601f600260018416159099029096019091169690960493840183900490920288018501905260a08701828152909550869450928592508401828280156111175780601f106110ec57610100808354040283529160200191611117565b820191906000526020600020905b8154815290600101906020018083116110fa57829003601f168201915b50505050508152602001600182018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156111b95780601f1061118e576101008083540402835291602001916111b9565b820191906000526020600020905b81548152906001019060200180831161119c57829003601f168201915b5050509183525050600282810180546040805160206001841615610100026000190190931694909404601f8101839004830285018301909152808452938101939083018282801561124b5780601f106112205761010080835404028352916020019161124b565b820191906000526020600020905b81548152906001019060200180831161122e57829003601f168201915b50505091835250506003820154600160a060020a031660208083019190915260048301805460408051601f600260001960018616156101000201909416939093049283018590048502810185018252828152940193928301828280156112f25780601f106112c7576101008083540402835291602001916112f2565b820191906000526020600020905b8154815290600101906020018083116112d557829003601f168201915b5050509190925250505060208082018a90528a825260408083018a905233606084018190526080840189905260009081526003835290812080546001810180835591835291839020865180519596509194879460059094029091019261135c9284929101906129ab565b50602082810151805161137592600185019201906129ab565b50604082015180516113919160028401916020909101906129ab565b50606082015160038201805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03909216919091179055608082015180516113e09160048401916020909101906129ab565b505050507f1171da58cb579de7b7441824a074e06c59a5c81ca6cd4b7872024675800b641189898960405180806020018060200180602001848103845287818151815260200191508051906020019080838360005b8381101561144d578181015183820152602001611435565b50505050905090810190601f16801561147a5780820380516001836020036101000a031916815260200191505b50848103835286518152865160209182019188019080838360005b838110156114ad578181015183820152602001611495565b50505050905090810190601f1680156114da5780820380516001836020036101000a031916815260200191505b50848103825285518152855160209182019187019080838360005b8381101561150d5781810151838201526020016114f5565b50505050905090810190601f16801561153a5780820380516001836020036101000a031916815260200191505b50965050505050505060405180910390a150600198975050505050505050565b60006115ef6002866040518082805190602001908083835b602083106115915780518252601f199092019160209182019101611572565b51815160209384036101000a60001901801990921691161790526040519190930194509192505080830381855afa1580156115d0573d6000803e3d6000fd5b5050506040513d60208110156115e557600080fd5b5051858585611fd2565b90505b949350505050565b6000611604612972565b6004866040518082805190602001908083835b602083106116365780518252601f199092019160209182019101611617565b518151600019602094850361010090810a82019283169219939093169190911790925294909201968752604080519788900382018820805460c0601f600260018416159099029096019091169690960493840183900490920288018501905260a08701828152909550869450928592508401828280156116f75780601f106116cc576101008083540402835291602001916116f7565b820191906000526020600020905b8154815290600101906020018083116116da57829003601f168201915b50505050508152602001600182018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156117995780601f1061176e57610100808354040283529160200191611799565b820191906000526020600020905b81548152906001019060200180831161177c57829003601f168201915b5050509183525050600282810180546040805160206001841615610100026000190190931694909404601f8101839004830285018301909152808452938101939083018282801561182b5780601f106118005761010080835404028352916020019161182b565b820191906000526020600020905b81548152906001019060200180831161180e57829003601f168201915b50505091835250506003820154600160a060020a031660208083019190915260048301805460408051601f600260001960018616156101000201909416939093049283018590048502810185018252828152940193928301828280156118d25780601f106118a7576101008083540402835291602001916118d2565b820191906000526020600020905b8154815290600101906020018083116118b557829003601f168201915b505050505081525050905060016118ea8787876125e7565b6040518082805190602001908083835b602083106119195780518252601f1990920191602091820191016118fa565b51815160209384036101000a60001901801990921691161790529201948552506040805194859003820190942033600090815260039092529390208054909250869150811061196457fe5b60009182526020808320845460018181018088559686529290942060059384029091018054909490930201916119b29183918591600261010091831615919091026000190190911604612a29565b50600182018160010190805460018160011615610100020316600290046119da929190612a29565b50600282810180546119ff928481019291600019610100600183161502011604612a29565b50600382810154908201805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0390921691909117905560048083018054611a5a928401919060026000196001831615610100020190911604612a29565b505033600090815260036020526040902080546002935090915085908110611a7e57fe5b90600052602060002090600502016000016040518082805460018160011615610100020316600290048015611aea5780601f10611ac8576101008083540402835291820191611aea565b820191906000526020600020905b815481529060010190602001808311611ad6575b50509283525050604051602091819003820190208054600181018083556000928352918390208451805193948694600590940290920192611b2e92849201906129ab565b506020828101518051611b4792600185019201906129ab565b5060408201518051611b639160028401916020909101906129ab565b50606082015160038201805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0390921691909117905560808201518051611bb29160048401916020909101906129ab565b505050507f7a8cc67b9ae89f90f008caa26d11aea9fa288c930e4c9b86e39b5addc3419eb7868686336040518080602001806020018060200185600160a060020a0316600160a060020a03168152602001848103845288818151815260200191508051906020019080838360005b83811015611c38578181015183820152602001611c20565b50505050905090810190601f168015611c655780820380516001836020036101000a031916815260200191505b50848103835287518152875160209182019189019080838360005b83811015611c98578181015183820152602001611c80565b50505050905090810190601f168015611cc55780820380516001836020036101000a031916815260200191505b50848103825286518152865160209182019188019080838360005b83811015611cf8578181015183820152602001611ce0565b50505050905090810190601f168015611d255780820380516001836020036101000a031916815260200191505b5097505050505050505060405180910390a150600195945050505050565b600360205281600052604060002081815481101515611d5e57fe5b60009182526020918290206005919091020180546040805160026001841615610100026000190190931692909204601f810185900485028301850190915280825291945092508391830182828015611df75780601f10611dcc57610100808354040283529160200191611df7565b820191906000526020600020905b815481529060010190602001808311611dda57829003601f168201915b505050505090806001018054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015611e955780601f10611e6a57610100808354040283529160200191611e95565b820191906000526020600020905b815481529060010190602001808311611e7857829003601f168201915b50505060028085018054604080516020601f6000196101006001871615020190941695909504928301859004850281018501909152818152959695945090925090830182828015611f275780601f10611efc57610100808354040283529160200191611f27565b820191906000526020600020905b815481529060010190602001808311611f0a57829003601f168201915b50505050600383015460048401805460408051602060026101006001861615026000190190941693909304601f81018490048402820184019092528181529596600160a060020a039094169593945090830182828015611fc85780601f10611f9d57610100808354040283529160200191611fc8565b820191906000526020600020905b815481529060010190602001808311611fab57829003601f168201915b5050505050905085565b6000611fdc612a9e565b5060408051610260810182526030808252603160208084019190915292820152600d60608083019190915260066080830152600960a083015260c0820152608660e0820152604861010082015260016101208201819052606561014083015260036101608301526004610180830181905260026101a08401526101c083019190915260056101e083015260006102008301526102208201526102408101919091528251603e111561208c57600080fd5b6000606061209b878787612616565b8051865160408051828152601f19601f840116810160200190915292935090916060908280156120d2576020820181803883390190505b5090508160208201846020870160056107d05a03fa508051603519830190829060009081106120fd57fe5b60209101015160f860020a9081900402600160f860020a031916151580612150575081600181518110151561212e57fe5b90602001015160f860020a900460f860020a0260f860020a900460ff16600114155b156121655760019750505050505050506115f2565b600295505b806002018610156121bf57818681518110151561218357fe5b0160200151600160f860020a031960f860020a918290049091028116146121b45760029750505050505050506115f2565b60019095019461216a565b81816002018151811015156121d057fe5b60209101015160f860020a9081900402600160f860020a031916156121ff5760039750505050505050506115f2565b600095505b60138610156122735786866013811061221957fe5b602002015160ff168287836003010181518110151561223457fe5b90602001015160f860020a900460f860020a0260f860020a900460ff161415156122685760049750505050505050506115f2565b600190950194612204565b600095505b60208610156122ee578b866020811061228d57fe5b1a60f860020a02600160f860020a031916828760138460030101018151811015156122b457fe5b60209101015160f860020a9081900402600160f860020a031916146122e35760059750505050505050506115f2565b600190950194612278565b5060009b9a5050505050505050505050565b33600090815260036020526040902080546060916002918490811061232157fe5b9060005260206000209060050201600001604051808280546001816001161561010002031660029004801561238d5780601f1061236b57610100808354040283529182019161238d565b820191906000526020600020905b815481529060010190602001808311612379575b50509283525050604051908190036020019020805460009081106123ad57fe5b6000918252602091829020600590910201805460408051601f60026000196101006001871615020190941693909304928301859004850281018501909152818152928301828280156124405780601f1061241557610100808354040283529160200191612440565b820191906000526020600020905b81548152906001019060200180831161242357829003601f168201915b50505050509050919050565b6060600161245b8585856125e7565b6040518082805190602001908083835b6020831061248a5780518252601f19909201916020918201910161246b565b51815160209384036101000a6000190180199092169116179052920194855250604051938490030190922080549092506000915081106124c657fe5b6000918252602091829020600590910201805460408051601f60026000196101006001871615020190941693909304928301859004850281018501909152818152928301828280156125595780601f1061252e57610100808354040283529160200191612559565b820191906000526020600020905b81548152906001019060200180831161253c57829003601f168201915b505050505090509392505050565b600060046125768585856125e7565b6040518082805190602001908083835b602083106125a55780518252601f199092019160209182019101612586565b51815160209384036101000a6000190180199092169116179052920194855250604051938490030190922060030154600160a060020a03169695505050505050565b60606115f2848484602060405190810160405280600081525060206040519081016040528060008152506126df565b60606000825184518651606001010190506000855190506000855190506000855190506000806000806060886040519080825280601f01601f19166020018201604052801561266c576020820181803883390190505b50905060208d01945060208c01935060208b0192508760208201528660408201528560608201526020810191506126a882606001868f51612934565b6126ba8d518360600101858e51612934565b6126cf8c518e51846060010101848d51612934565b9c9b505050505050505050505050565b6060808690506060869050606086905060608690506060869050606081518351855187518951010101016040519080825280601f01601f191660200182016040528015612733576020820181803883390190505b509050806000805b885181101561279957888181518110151561275257fe5b90602001015160f860020a900460f860020a02838380600101945081518110151561277957fe5b906020010190600160f860020a031916908160001a90535060010161273b565b5060005b87518110156127fb5787818151811015156127b457fe5b90602001015160f860020a900460f860020a0283838060010194508151811015156127db57fe5b906020010190600160f860020a031916908160001a90535060010161279d565b5060005b865181101561285d57868181518110151561281657fe5b90602001015160f860020a900460f860020a02838380600101945081518110151561283d57fe5b906020010190600160f860020a031916908160001a9053506001016127ff565b5060005b85518110156128bf57858181518110151561287857fe5b90602001015160f860020a900460f860020a02838380600101945081518110151561289f57fe5b906020010190600160f860020a031916908160001a905350600101612861565b5060005b84518110156129215784818151811015156128da57fe5b90602001015160f860020a900460f860020a02838380600101945081518110151561290157fe5b906020010190600160f860020a031916908160001a9053506001016128c3565b50909d9c50505050505050505050505050565b5b60208110612954578151835260209283019290910190601f1901612935565b905182516020929092036101000a6000190180199091169116179052565b60a0604051908101604052806060815260200160608152602001606081526020016000600160a060020a03168152602001606081525090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106129ec57805160ff1916838001178555612a19565b82800160010185558215612a19579182015b82811115612a195782518255916020019190600101906129fe565b50612a25929150612abe565b5090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10612a625780548555612a19565b82800160010185558215612a1957600052602060002091601f016020900482015b82811115612a19578254825591600101919060010190612a83565b610260604051908101604052806013906020820280388339509192915050565b612ad891905b80821115612a255760008155600101612ac4565b9056fea165627a7a72305820ea8d007c486e3005dba8325ecc618fac1b9b09e8f18d7ab2211d209206c10a0f0029";

    public static final String FUNC_ADDAPPLICATION = "addApplication";

    public static final String FUNC_RSAVERIFY = "RSAVerify";

    public static final String FUNC_VERIFYAPPLICATION = "verifyApplication";

    public static final String FUNC_APPLICATIONDATABASE = "ApplicationDatabase";

    public static final String FUNC_PKCS1SHA256VERIFY = "pkcs1Sha256Verify";

    public static final String FUNC_GETVERIFIERAPP = "getVerifierApp";

    public static final String FUNC_GETVERIFIEDAPP = "getVerifiedApp";

    public static final String FUNC_ISAPPVERIFYBYDEVELOPER = "isAppVerifyBydeveloper";

    public static final Event APPLICATIONADDED_EVENT = new Event("ApplicationAdded", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}));
    ;

    public static final Event APPLICATIONVERIFIED_EVENT = new Event("ApplicationVerified", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Address>() {}));
    ;

    @Deprecated
    protected AndroidApplication(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected AndroidApplication(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected AndroidApplication(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected AndroidApplication(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> addApplication(String app_packageName, String app_name, String app_publicKey, String app_N_of_publicKey, String app_webSite, String app_challeng) {
        final Function function = new Function(
                FUNC_ADDAPPLICATION, 
                Arrays.<Type>asList(new Utf8String(app_packageName),
                new Utf8String(app_name),
                new Utf8String(app_publicKey),
                new Utf8String(app_N_of_publicKey),
                new Utf8String(app_webSite),
                new Utf8String(app_challeng)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> RSAVerify(byte[] _data, byte[] _s, byte[] _e, byte[] _m) {
        final Function function = new Function(FUNC_RSAVERIFY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicBytes(_data), 
                new org.web3j.abi.datatypes.DynamicBytes(_s), 
                new org.web3j.abi.datatypes.DynamicBytes(_e), 
                new org.web3j.abi.datatypes.DynamicBytes(_m)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> verifyApplication(String app_packageName, String app_name, String app_publicKey, BigInteger myAppId) {
        final Function function = new Function(
                FUNC_VERIFYAPPLICATION, 
                Arrays.<Type>asList(new Utf8String(app_packageName),
                new Utf8String(app_name),
                new Utf8String(app_publicKey),
                new Uint256(myAppId)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Tuple5<String, String, String, String, String>> ApplicationDatabase(String param0, BigInteger param1) {
        final Function function = new Function(FUNC_APPLICATIONDATABASE, 
                Arrays.<Type>asList(new Address(param0),
                new Uint256(param1)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Address>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteCall<Tuple5<String, String, String, String, String>>(
                new Callable<Tuple5<String, String, String, String, String>>() {
                    @Override
                    public Tuple5<String, String, String, String, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<String, String, String, String, String>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (String) results.get(2).getValue(), 
                                (String) results.get(3).getValue(), 
                                (String) results.get(4).getValue());
                    }
                });
    }

    public RemoteCall<BigInteger> pkcs1Sha256Verify(byte[] _sha256, byte[] _s, byte[] _e, byte[] _m) {
        final Function function = new Function(FUNC_PKCS1SHA256VERIFY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_sha256), 
                new org.web3j.abi.datatypes.DynamicBytes(_s), 
                new org.web3j.abi.datatypes.DynamicBytes(_e), 
                new org.web3j.abi.datatypes.DynamicBytes(_m)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getVerifierApp(BigInteger myAppId) {
        final Function function = new Function(FUNC_GETVERIFIERAPP, 
                Arrays.<Type>asList(new Uint256(myAppId)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getVerifiedApp(String app_packageName, String app_name, String app_signature) {
        final Function function = new Function(FUNC_GETVERIFIEDAPP, 
                Arrays.<Type>asList(new Utf8String(app_packageName),
                new Utf8String(app_name),
                new Utf8String(app_signature)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> isAppVerifyBydeveloper(String app_packageName, String app_name, String app_signature) {
        final Function function = new Function(FUNC_ISAPPVERIFYBYDEVELOPER, 
                Arrays.<Type>asList(new Utf8String(app_packageName),
                new Utf8String(app_name),
                new Utf8String(app_signature)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<AndroidApplication> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(AndroidApplication.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<AndroidApplication> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(AndroidApplication.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<AndroidApplication> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(AndroidApplication.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<AndroidApplication> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(AndroidApplication.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public List<ApplicationAddedEventResponse> getApplicationAddedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(APPLICATIONADDED_EVENT, transactionReceipt);
        ArrayList<ApplicationAddedEventResponse> responses = new ArrayList<ApplicationAddedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            ApplicationAddedEventResponse typedResponse = new ApplicationAddedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.app_packageName = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.app_name = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.app_publicKey = (String) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ApplicationAddedEventResponse> applicationAddedEventObservable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, ApplicationAddedEventResponse>() {
            @Override
            public ApplicationAddedEventResponse apply(Log log) throws Exception {
                EventValuesWithLog eventValues = extractEventParametersWithLog(APPLICATIONADDED_EVENT, log);
                ApplicationAddedEventResponse typedResponse = new ApplicationAddedEventResponse();
                typedResponse.log = log;
                typedResponse.app_packageName = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.app_name = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.app_publicKey = (String) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });

    }

    public Flowable<ApplicationAddedEventResponse> applicationAddedEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(APPLICATIONADDED_EVENT));
        return applicationAddedEventObservable(filter);
    }

    public List<ApplicationVerifiedEventResponse> getApplicationVerifiedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(APPLICATIONVERIFIED_EVENT, transactionReceipt);
        ArrayList<ApplicationVerifiedEventResponse> responses = new ArrayList<ApplicationVerifiedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            ApplicationVerifiedEventResponse typedResponse = new ApplicationVerifiedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.app_packageName = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.app_name = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.app_publicKey = (String) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.owner = (String) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ApplicationVerifiedEventResponse> applicationVerifiedEventObservable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, ApplicationVerifiedEventResponse>() {
            @Override
            public ApplicationVerifiedEventResponse apply(Log log) throws Exception {
                EventValuesWithLog eventValues = extractEventParametersWithLog(APPLICATIONVERIFIED_EVENT, log);
                ApplicationVerifiedEventResponse typedResponse = new ApplicationVerifiedEventResponse();
                typedResponse.log = log;
                typedResponse.app_packageName = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.app_name = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.app_publicKey = (String) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.owner = (String) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<ApplicationVerifiedEventResponse> applicationVerifiedEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(APPLICATIONVERIFIED_EVENT));
        return applicationVerifiedEventObservable(filter);
    }

    @Deprecated
    public static AndroidApplication load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new AndroidApplication(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static AndroidApplication load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new AndroidApplication(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static AndroidApplication load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new AndroidApplication(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static AndroidApplication load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new AndroidApplication(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class ApplicationAddedEventResponse {
        public Log log;

        public String app_packageName;

        public String app_name;

        public String app_publicKey;
    }

    public static class ApplicationVerifiedEventResponse {
        public Log log;

        public String app_packageName;

        public String app_name;

        public String app_publicKey;

        public String owner;
    }
}
