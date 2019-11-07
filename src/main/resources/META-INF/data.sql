INSERT INTO `paradas` (`idparada`, `denominacion`, `fecha`) VALUES (1, 'El Corte Ingles', '2019-11-06'),(2, 'Los Fresnos', '2019-11-06'),(3, 'Jardin Botanico', '2019-11-06'),(4, 'Universidad Laboral', '2019-11-06'),(5, 'Hospital de Cabueñes', '2019-11-06'),(6, 'Camin de Rubin', '2019-11-06'),(7, 'La gota de Leche', '2019-11-06');
	
INSERT INTO `lineas` (`idlineas`, `dencorta`, `denlarga`, `fecha`) VALUES (1, '1', 'El Cerilleru - Hospital de Cabueñes', '2019-11-06'),(2, '2', 'El Corte Ingles - Hospital de Cabueñes', '2019-11-06');

INSERT INTO `lineaparada` (`idlineaparada`, `idlinea`, `idparada`, `marquesina`) VALUES	(1, 1, 6, 6),(2, 1, 7, 7),(3, 1, 4, 4),(4, 1, 5, 5),(5, 2, 1, 1),(6, 2, 2, 2),(7, 2, 4, 4),(8, 2, 5, 5);
	