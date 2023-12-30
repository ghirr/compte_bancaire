package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
	private static final QName _GetComptes_QNAME = new QName("http://Service/", "getComptes");
	private static final QName _TransfertResponse_QNAME = new QName("http://Service/", "transfertResponse");
	private static final QName _ExistResponse_QNAME = new QName("http://Service/", "existResponse");
	private static final QName _SaveCompte_QNAME = new QName("http://Service/", "saveCompte");
	private static final QName _GetComptesResponse_QNAME = new QName("http://Service/", "getComptesResponse");
	private static final QName _GetActeResponse_QNAME = new QName("http://Service/", "getActeResponse");
	private static final QName _GetCompteResponse_QNAME = new QName("http://Service/", "getCompteResponse");
	private static final QName _GetCompte_QNAME = new QName("http://Service/", "getCompte");
	private static final QName _GetHistResponse_QNAME = new QName("http://Service/", "getHistResponse");
	private static final QName _Retirer_QNAME = new QName("http://Service/", "retirer");
	private static final QName _SaveCompteResponse_QNAME = new QName("http://Service/", "saveCompteResponse");
	private static final QName _GetHist_QNAME = new QName("http://Service/", "getHist");
	private static final QName _Verser_QNAME = new QName("http://Service/", "verser");
	private static final QName _SetHistoriqueResponse_QNAME = new QName("http://Service/", "setHistoriqueResponse");
	private static final QName _Exist_QNAME = new QName("http://Service/", "exist");
	private static final QName _RetirerResponse_QNAME = new QName("http://Service/", "retirerResponse");
	private static final QName _GetActe_QNAME = new QName("http://Service/", "getActe");
	private static final QName _SetHistorique_QNAME = new QName("http://Service/", "setHistorique");
	private static final QName _Transfert_QNAME = new QName("http://Service/", "transfert");
	private static final QName _VerserResponse_QNAME = new QName("http://Service/", "verserResponse");

	public GetCompte createGetCompte() {
		return new GetCompte();
	}

	public GetActeResponse createGetActeResponse() {
		return new GetActeResponse();
	}

	public GetCompteResponse createGetCompteResponse() {
		return new GetCompteResponse();
	}

	public Retirer createRetirer() {
		return new Retirer();
	}

	public GetHistResponse createGetHistResponse() {
		return new GetHistResponse();
	}

	public SaveCompteResponse createSaveCompteResponse() {
		return new SaveCompteResponse();
	}

	public GetComptes createGetComptes() {
		return new GetComptes();
	}

	public TransfertResponse createTransfertResponse() {
		return new TransfertResponse();
	}

	public GetComptesResponse createGetComptesResponse() {
		return new GetComptesResponse();
	}

	public ExistResponse createExistResponse() {
		return new ExistResponse();
	}

	public SaveCompte createSaveCompte() {
		return new SaveCompte();
	}

	public Exist createExist() {
		return new Exist();
	}

	public GetActe createGetActe() {
		return new GetActe();
	}

	public RetirerResponse createRetirerResponse() {
		return new RetirerResponse();
	}

	public VerserResponse createVerserResponse() {
		return new VerserResponse();
	}

	public SetHistorique createSetHistorique() {
		return new SetHistorique();
	}

	public Transfert createTransfert() {
		return new Transfert();
	}

	public GetHist createGetHist() {
		return new GetHist();
	}

	public Verser createVerser() {
		return new Verser();
	}

	public SetHistoriqueResponse createSetHistoriqueResponse() {
		return new SetHistoriqueResponse();
	}

	public Historique createHistorique() {
		return new Historique();
	}

	public Compte createCompte() {
		return new Compte();
	}

	@XmlElementDecl(namespace = "http://Service/", name = "getComptes")
	public JAXBElement<GetComptes> createGetComptes(GetComptes var1) {
		return new JAXBElement(_GetComptes_QNAME, GetComptes.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "transfertResponse")
	public JAXBElement<TransfertResponse> createTransfertResponse(TransfertResponse var1) {
		return new JAXBElement(_TransfertResponse_QNAME, TransfertResponse.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "existResponse")
	public JAXBElement<ExistResponse> createExistResponse(ExistResponse var1) {
		return new JAXBElement(_ExistResponse_QNAME, ExistResponse.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "saveCompte")
	public JAXBElement<SaveCompte> createSaveCompte(SaveCompte var1) {
		return new JAXBElement(_SaveCompte_QNAME, SaveCompte.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "getComptesResponse")
	public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse var1) {
		return new JAXBElement(_GetComptesResponse_QNAME, GetComptesResponse.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "getActeResponse")
	public JAXBElement<GetActeResponse> createGetActeResponse(GetActeResponse var1) {
		return new JAXBElement(_GetActeResponse_QNAME, GetActeResponse.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "getCompteResponse")
	public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse var1) {
		return new JAXBElement(_GetCompteResponse_QNAME, GetCompteResponse.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "getCompte")
	public JAXBElement<GetCompte> createGetCompte(GetCompte var1) {
		return new JAXBElement(_GetCompte_QNAME, GetCompte.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "getHistResponse")
	public JAXBElement<GetHistResponse> createGetHistResponse(GetHistResponse var1) {
		return new JAXBElement(_GetHistResponse_QNAME, GetHistResponse.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "retirer")
	public JAXBElement<Retirer> createRetirer(Retirer var1) {
		return new JAXBElement(_Retirer_QNAME, Retirer.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "saveCompteResponse")
	public JAXBElement<SaveCompteResponse> createSaveCompteResponse(SaveCompteResponse var1) {
		return new JAXBElement(_SaveCompteResponse_QNAME, SaveCompteResponse.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "getHist")
	public JAXBElement<GetHist> createGetHist(GetHist var1) {
		return new JAXBElement(_GetHist_QNAME, GetHist.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "verser")
	public JAXBElement<Verser> createVerser(Verser var1) {
		return new JAXBElement(_Verser_QNAME, Verser.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "setHistoriqueResponse")
	public JAXBElement<SetHistoriqueResponse> createSetHistoriqueResponse(SetHistoriqueResponse var1) {
		return new JAXBElement(_SetHistoriqueResponse_QNAME, SetHistoriqueResponse.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "exist")
	public JAXBElement<Exist> createExist(Exist var1) {
		return new JAXBElement(_Exist_QNAME, Exist.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "retirerResponse")
	public JAXBElement<RetirerResponse> createRetirerResponse(RetirerResponse var1) {
		return new JAXBElement(_RetirerResponse_QNAME, RetirerResponse.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "getActe")
	public JAXBElement<GetActe> createGetActe(GetActe var1) {
		return new JAXBElement(_GetActe_QNAME, GetActe.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "setHistorique")
	public JAXBElement<SetHistorique> createSetHistorique(SetHistorique var1) {
		return new JAXBElement(_SetHistorique_QNAME, SetHistorique.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "transfert")
	public JAXBElement<Transfert> createTransfert(Transfert var1) {
		return new JAXBElement(_Transfert_QNAME, Transfert.class, (Class) null, var1);
	}

	@XmlElementDecl(namespace = "http://Service/", name = "verserResponse")
	public JAXBElement<VerserResponse> createVerserResponse(VerserResponse var1) {
		return new JAXBElement(_VerserResponse_QNAME, VerserResponse.class, (Class) null, var1);
	}
}